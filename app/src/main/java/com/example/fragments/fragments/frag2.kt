package com.example.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.example.fragments.R

class frag2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag2, container, false)
        var disMessage = arguments?.getString("txtAtoB")
        val txtRec = view.findViewById<TextView>(R.id.txtRec)
        txtRec.setText(disMessage)

        return view
    }

}