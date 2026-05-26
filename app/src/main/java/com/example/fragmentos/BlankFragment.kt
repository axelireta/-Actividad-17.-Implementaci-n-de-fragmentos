package com.example.fragmentos

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

const val TAG = "fragmentosLog"
class BlankFragment : Fragment() {

    var _binding: FragmentBlankBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i(TAG, "OnCreateView")
        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "OnCreate")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "OnDetach")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "OnAttach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "OnDestroyView")
        _binding = null
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }


}