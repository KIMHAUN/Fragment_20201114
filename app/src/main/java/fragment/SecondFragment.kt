package fragment

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.appisna.blogspot.fragment_20201114.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        alertBtn.setOnClickListener {
            val alert = AlertDialog.Builder(context!!)
            alert.setTitle("프래그먼트 연습")
            alert.setMessage("프래그먼트에서 alert을 띄웁니다.")
            alert.setPositiveButton("확인", null)
            alert.show()
        }
    }
}