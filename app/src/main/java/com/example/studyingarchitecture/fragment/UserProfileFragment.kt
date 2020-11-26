package com.example.studyingarchitecture.fragment

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.SavedStateViewModelFactory
import com.example.studyingarchitecture.R
import com.example.studyingarchitecture.view_model.UserProfileViewModel

class UserProfileFragment : Fragment() {
    private val viewModel: UserProfileViewModel by viewModels(
        factoryProducer = { SavedStateViewModelFactory(Application(), this) }

    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.user_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.user.observe(viewLifecycleOwner){
            //update UI
        }
    }
}