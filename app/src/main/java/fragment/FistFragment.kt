package fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.appisna.blogspot.fragment_20201114.R
import kotlinx.android.synthetic.main.fragment_first.*

//액티비티에 올라갈 조각
class FistFragment : Fragment() {

    //프래그먼트 onCreateView : xml연결만을 담당.
    //기본 작성된 return 교체.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    //액티비티가 만들어져있을 때

    //프래그먼트 : 액티비티의 부속품으로 활용. 자체적으로 하나의 화면이 아님.
    //프래그먼트의 onCreate : 프래그먼트가 만들어질 때, 화면은 아직 안만들어짐..(부속품 -> 화면)
    //안드로이드 대부분 기능은 화면이 만들어지고 사용해야하기 때문에 프래그먼트의 onCreate는 잘 쓰이지 않음.

    //프래그먼트 동작 관련 코드들 적는 함수 :  onActivityCreated
    //나를 부품으로 들고 있는 화면이 완성된 시점. 동작 관련 코드 대부분을 화면 완성 이후에 실행되게해줌.
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn.setOnClickListener {
            //context : 나를 들고 있는 화면이 null이 아니다(화면 생성 후이기 때문에)
            Toast.makeText(context!!, "프래그먼트로 토스트 띄우기", Toast.LENGTH_SHORT).show()

        }
    }

}