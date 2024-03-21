package ru.netology.chempionat.ui.track

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.netology.chempionat.databinding.FragmentTrackBinding

class TrackFragment : Fragment() {

    private var _binding: FragmentTrackBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val trackViewModel =
            ViewModelProvider(this).get(TrackViewModel::class.java)

        _binding = FragmentTrackBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTrack
        trackViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}