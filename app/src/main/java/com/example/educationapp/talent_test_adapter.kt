import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.educationapp.R
import com.example.educationapp.TalentExamClass
import kotlinx.android.synthetic.main.talent_test_data_presentation.view.*

class talent_test_adapter(val context: Context, val items: ArrayList<TalentExamClass>) :
    RecyclerView.Adapter<talent_test_adapter.ViewHolder>() {

    /**
     * Inflates the item views which is designed in xml layout file
     *
     * create a new
     * {@link ViewHolder} and initializes some private fields to be used by RecyclerView.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.talent_test_data_presentation,
                parent,
                false
            )
        )
    }

    /**
     * Binds each item in the ArrayList to a view
     *
     * Called when RecyclerView needs a new {@link ViewHolder} of the given type to represent
     * an item.
     *
     * This new ViewHolder should be constructed with a new View that can represent the items
     * of the given type. You can either create a new View manually or inflate it from an XML
     * layout file.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items.get(position)
        
        holder.tt_testname.text = item.test_name
        holder.tt_eligibility.text = item.eligibility
        holder.tt_syllabus.text = item.syllabus
        holder.tt_website.text = item.website
    }

    /**
     * Gets the number of items in the list
     */
    override fun getItemCount(): Int {
        return items.size
    }

    /**
     * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each item to
        val tt_testname = view.tt_test_name
        val tt_eligibility = view.tt_eligibility
        val tt_syllabus = view.tt_syllabus
        val tt_website = view.tt_website
    }
}