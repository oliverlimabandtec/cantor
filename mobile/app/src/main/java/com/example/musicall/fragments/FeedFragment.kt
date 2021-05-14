package com.example.musicall.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.musicall.R

class FeedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       val fragmentTransaction = activity?.supportFragmentManager?.beginTransaction()
        val fragment = CardPublicacoes()

        fragmentTransaction?.add(R.id.ll_publicacao, fragment)

        fragmentTransaction?.commit()

        super.onViewCreated(view, savedInstanceState)

    }

}