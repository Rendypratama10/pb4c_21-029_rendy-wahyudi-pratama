package org.deskconn.roomdatabase.fragments.update

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.deskconn.roomdatabase.R

public class UpdateFragmentDirections private constructor() {
  public companion object {
    public fun actionUpdateFragmentToListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_updateFragment_to_listFragment)
  }
}
