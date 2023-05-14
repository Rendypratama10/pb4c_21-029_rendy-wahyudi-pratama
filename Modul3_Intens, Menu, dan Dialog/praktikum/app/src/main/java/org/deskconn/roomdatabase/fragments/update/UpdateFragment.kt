package org.deskconn.roomdatabase.fragments.update

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_update.*
import kotlinx.android.synthetic.main.fragment_update.view.*
import org.deskconn.roomdatabase.R
import org.deskconn.roomdatabase.User
import org.deskconn.roomdatabase.data.UserViewModel

class UpdateFragment : Fragment() {

    private val args by navArgs<UpdateFragmentArgs>()

    private lateinit var mUserViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_update, container, false)

        mUserViewModel = ViewModelProvider(this)[UserViewModel::class.java]

        //This view fetch the data from list update icon clicked position
        view.namaUpdate.setText(args.currentUser.nama)
        view.jenisKelaminUpdate.setText(args.currentUser.jenisKelamin)
        view.teleponUpdate.setText(args.currentUser.telepon.toString())

        view.ubahData.setOnClickListener {
            updateItem()
        }

        //Add menu
        setHasOptionsMenu(true)

        return view
    }

    private fun updateItem() {
        val namaVal = namaUpdate.text.toString()
        val jenisKelaminVal = jenisKelaminUpdate.text.toString()
        val teleponVal = teleponUpdate.text.toString()

        if (namaVal.isEmpty() && jenisKelaminVal.isEmpty() && teleponVal.isEmpty()) {
            namaUpdate.error = "Nama Harus Diisi"
            jenisKelaminUpdate.error = "Jenis Kelamin Harus Diisi"
            teleponUpdate.error = "No. Telepon Harus Diisi"
            //Create user object

        } else if (namaVal.isEmpty()) {
            namaUpdate.error = "Nama Harus Diisi"
        } else if (jenisKelaminVal.isEmpty()) {
            jenisKelaminUpdate.error = "Jenis Kelamin Harus Diisi"
        } else if (teleponVal.isEmpty()) {
            teleponUpdate.error = "No. Telepon Harus Diisi"
        } else {
            //Create user object
            val updateUser = User(args.currentUser.id, namaVal, jenisKelaminVal, teleponVal)

            //Add data to database
            mUserViewModel.updateUser(updateUser)
            Toast.makeText(requireContext(), "Updated Successfully", Toast.LENGTH_SHORT).show()

            //Navigate Back
            findNavController().popBackStack(R.id.action_updateFragment_to_listFragment, false)
            Log.e("Fragment", "${findNavController().popBackStack()}")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.delete_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menue_delete){
            deleteUserDialog()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun deleteUserDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setPositiveButton("Ya") { _, _ ->
            mUserViewModel.deleteUser(args.currentUser)
            Toast.makeText(requireContext(),
                "${args.currentUser.nama} Berhasil Dihapus",
                Toast.LENGTH_SHORT).show()
            findNavController().popBackStack()
        }
        builder.setNegativeButton("Tidak") {_, _, ->}
        builder.setIcon(R.drawable.ic_warning)
        builder.setTitle("Hapus ${args.currentUser.nama}")
        builder.setMessage("Apakah kamu yakin? Apakah kamu ingin menghapus ${args.currentUser.nama}?")
        builder.create().show()
    }
}