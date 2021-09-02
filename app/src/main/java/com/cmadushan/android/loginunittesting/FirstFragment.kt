package com.cmadushan.android.loginunittesting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cmadushan.android.loginunittesting.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

  private var _binding: FragmentFirstBinding? = null

  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    _binding = FragmentFirstBinding.inflate(inflater, container, false)
    return binding.root

  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.login.setOnClickListener {
      binding.loading.visibility = View.VISIBLE

      val firstName = binding.FirstName.text.toString()
      val lastName = binding.LastName.text.toString()
      val shape = binding.ShapeResult.text.toString()
      val value = binding.Value.text.toString()
      val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(firstName, lastName, shape,value)
      findNavController().navigate(action)
      Toast.makeText(context, "Hello " + firstName , Toast.LENGTH_LONG).show()

    }
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}