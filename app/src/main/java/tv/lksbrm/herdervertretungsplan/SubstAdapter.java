package tv.lksbrm.herdervertretungsplan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Lukas on 10.04.2017.
 */
public class SubstAdapter extends RecyclerView.Adapter<SubstAdapter.ViewHolderClass>
{





    class ViewHolderClass extends RecyclerView.ViewHolder
    {

        TextView lesson;
        TextView type;
        TextView teacher;
        TextView room;
        TextView subject;

        public ViewHolderClass(View itemView)
        {
            super(itemView);

            lesson = (TextView) itemView.findViewById(R.id.lesson);
            type = (TextView) itemView.findViewById(R.id.textView3);
            teacher = (TextView) itemView.findViewById(R.id.teacher);
            room = (TextView) itemView.findViewById(R.id.room);
            subject = (TextView) itemView.findViewById(R.id.subject);


        }
    }

    @Override
    public ViewHolderClass onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ViewHolderClass(itemView1);
    }

    @Override
    public void onBindViewHolder(ViewHolderClass holder, int position)
    {

        holder.lesson.setText(MainActivity.elements.get(position).getLesson());
        holder.type.setText(MainActivity.elements.get(position).getType());
        holder.subject.setText(MainActivity.elements.get(position).getSubject());
        holder.room.setText(MainActivity.elements.get(position).getRoom());
        holder.teacher.setText(MainActivity.elements.get(position).getTeacher());

    }

    @Override
    public int getItemCount()
    {
        return MainActivity.elements.size();
    }

}
