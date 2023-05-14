package org.deskconn.roomdatabase.fragments.add

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_add.view.*
import kotlinx.android.synthetic.main.fragment_update.*
import org.deskconn.roomdatabase.R
import org.deskconn.roomdatabase.User
import org.deskconn.roomdatabase.data.UserViewModel

class AddFragment : Fragment() {

    private lateinit var mUserViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        //mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java) Old Method using
        mUserViewModel = ViewModelProvider(this)[UserViewModel::class.java] // Method without using get

        view.tambahData.setOnClickListener {
            insertDataToDataBase()
        }

        return view
    }

    @SuppressLint("CommitTransaction")
    private fun insertDataToDataBase() {
        val namaVal = nama.text.toString()
        val jenisKelaminVal = jenisKelamin.text.toString()
        val teleponVal = telepon.text.toString()

        if (namaVal.isEmpty() && jenisKelaminVal.isEmpty() && teleponVal.isEmpty()) {
            nama.error = "Nama Harus Diisi"
            jenisKelamin.error = "Jenis Kelamin Harus Diisi"
            telepon.error = "No. Telepon Harus Diisi"
            //Create user object

        } else if (namaVal.isEmpty()) {
            nama.error = "Nama Harus Diisi"
        } else if (jenisKelaminVal.isEmpty()) {
            jenisKelamin.error = "Jenis Kelamin Harus Diisi"
        } else if (teleponVal.isEmpty()) {
            telepon.error = "Age required"
        } else {
            val user = User(0, namaVal, jenisKelaminVal, teleponVal)

            //Add data to database
            mUserViewModel.addUser(user)
            Toast.makeText(requireContext(), "Successfully added", Toast.LENGTH_SHORT).show()

            //Navigate Back
            findNavController().popBackStack(R.id.action_addFragment_to_listFragment, false)

            Log.e("Fragment", "${findNavController().popBackStack()}")
        }
    }

}