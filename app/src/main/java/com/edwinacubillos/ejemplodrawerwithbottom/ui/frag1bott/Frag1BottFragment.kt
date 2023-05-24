package com.edwinacubillos.ejemplodrawerwithbottom.ui.frag1bott

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edwinacubillos.ejemplodrawerwithbottom.R

class Frag1BottFragment : Fragment() {

    companion object {
        fun newInstance() = Frag1BottFragment()
    }

    private lateinit var viewModel: Frag1BottViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag1_bott, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Frag1BottViewModel::class.java)
        // TODO: Use the ViewModel
    }

}