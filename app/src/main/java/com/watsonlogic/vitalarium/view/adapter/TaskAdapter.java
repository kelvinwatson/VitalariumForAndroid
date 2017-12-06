package com.watsonlogic.vitalarium.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.watsonlogic.vitalarium.databinding.TaskBinding;
import com.watsonlogic.vitalarium.model.task.Task;

import java.util.List;

/**
 * Adapter for task object, uses data binding
 */
public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    private List<Task> tasks;

    public TaskAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        private final TaskBinding binding;
        public TextView titleText;
        public TextView descriptionText;

        public TaskViewHolder(TaskBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Task task) {
            binding.setTask(task);
            binding.executePendingBindings();
        }
    }

    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TaskBinding taskBinding = TaskBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new TaskViewHolder(taskBinding);
    }

    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position) {
        holder.bind(tasks.get(position));
    }

    @Override
    public int getItemCount() {
        return tasks == null ? 0 : tasks.size();
    }
}