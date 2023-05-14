package org.deskconn.roomdatabase.fragments.list

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import org.deskconn.roomdatabase.R
import org.deskconn.roomdatabase.User

public class ListFragmentDirections private constructor() {
  private data class ActionListFragmentToUpdateFragment(
    public val currentUser: User
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_listFragment_to_updateFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(User::class.java)) {
        result.putParcelable("currentUser", this.currentUser as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(User::class.java)) {
        result.putSerializable("currentUser", this.currentUser as Serializable)
      } else {
        throw UnsupportedOperationException(User::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionListFragmentToAddFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listFragment_to_addFragment)

    public fun actionListFragmentToUpdateFragment(currentUser: User): NavDirections =
        ActionListFragmentToUpdateFragment(currentUser)
  }
}
