package com.cmadushan.android.loginunittesting


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cmadushan.android.loginunittesting.Shape.Shape
import com.cmadushan.android.loginunittesting.Shape.ShapeFactory
import com.cmadushan.android.loginunittesting.databinding.FragmentSecondBinding
import kotlin.math.sqrt


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val args =SecondFragmentArgs.fromBundle(it)
            binding.Name.text=createFullName(args.firstName,args.lastName)
            binding.ShapeResult1.text= selectShape(args.shape.toUpperCase())
            binding.Squareroot.text=findSquareRoot(args.value.toInt()).toString()
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun createFullName(firstName:String, lastname:String ):String{
        return "Hello, $firstName $lastname"
    }

    fun findSquareRoot(value: Int): Int {
        return sqrt(value.toDouble()).toInt()
    }
    private fun selectShape(ShapeType:String): String {
        val shapefactory = ShapeFactory()
        val shape: Shape? = shapefactory.getShape(ShapeType )
        return shape?.draw().toString()

    }

}