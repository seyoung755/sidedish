package com.example.sidedish.ui.detail

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.sidedish.R
import java.lang.IllegalStateException

class MenuAlertDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage(getString(R.string.order_complete))
                .setPositiveButton(getString(R.string.order_confirmed),
                DialogInterface.OnClickListener { _, _ ->
                    findNavController().navigate(R.id.action_detailFragment_to_homeFragment)
                })
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}