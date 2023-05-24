package com.edwinacubillos.ejemplodrawerwithbottom.ui.frag2bott

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edwinacubillos.ejemplodrawerwithbottom.R

class Frag2BottFragment : Fragment() {

    companion object {
        fun newInstance() = Frag2BottFragment()
    }

    private lateinit var viewModel: Frag2BottViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag2_bott, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Frag2BottViewModel::class.java)
        // TODO: Use the ViewModel
    }

}