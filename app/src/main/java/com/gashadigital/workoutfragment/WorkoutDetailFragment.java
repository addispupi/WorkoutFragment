package com.gashadigital.workoutfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class WorkoutDetailFragment extends Fragment {
    private long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }
    public void setWorkout(long id) {
        this.workoutId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null) {
            TextView title = view.findViewById(R.id.workout_detail_title);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = view.findViewById(R.id.workout_detail_desc);
            description.setText(workout.getDescription());
        }
    }

}