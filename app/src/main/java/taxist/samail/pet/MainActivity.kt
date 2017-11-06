package taxist.samail.pet

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {
    /**
     * Called when the activity is first created.
     */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val res = resources

        setContentView(R.layout.activity_main)
        val pie = Pie.apply {
            addItem("Agamemnon", 2f, res.getColor(R.color.seafoam))
            addItem("Bocephus", 3.5f, res.getColor(R.color.chartreuse))
            addItem("Calliope", 2.5f, res.getColor(R.color.emerald))
            addItem("Daedalus", 3f, res.getColor(R.color.bluegrass))
            addItem("Euripides", 1f, res.getColor(R.color.turquoise))
            addItem("Ganymede", 3f, res.getColor(R.color.slate))
        }
        Reset.setOnClickListener { pie.currentItem = 0 }
    }
}
