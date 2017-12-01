package com.watsonlogic.vitalarium.model.task;

import com.watsonlogic.vitalarium.model.comment.Comment;

import java.util.List;

public class Task {
    private String id;
    private String title;
    private String description;
    private String size;
    private String sprint;
    private String project;
    private long dueDate;
    private List<Comment> comments;
    private long createdOn;
    private String createdBy;
    private long updatedOn;
    private String updatedBy;
    private String createdByCreatedOnIndex;

    public Task(){
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Task(String id, String title, String description, String size, String sprint,
                String project, long dueDate, List<Comment> comments, long createdOn,
                String createdBy, long updatedOn, String updatedBy) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.size = size;
        this.sprint = sprint;
        this.project = project;
        this.dueDate = dueDate;
        this.comments = comments;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.updatedOn = createdOn; //initialize with creation date
        this.updatedBy = createdBy; //initialize with creator
        this.createdByCreatedOnIndex = this.createdBy + '_' + this.createdOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public long getDueDate() {
        return dueDate;
    }

    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public long getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(long updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedByCreatedOnIndex() {
        return createdByCreatedOnIndex;
    }

    public void setCreatedByCreatedOnIndex(String createdByCreatedOnIndex) {
        this.createdByCreatedOnIndex = createdByCreatedOnIndex;
    }

    public static class TaskBuilder {
        private String id;
        private String title;
        private String description;
        private String size;
        private String sprint;
        private String project;
        private long dueDate;
        private List<Comment> comments;
        private long createdOn;
        private String createdBy;
        private long updatedOn;
        private String updatedBy;

        public TaskBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public TaskBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public TaskBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public TaskBuilder setSprint(String sprint) {
            this.sprint = sprint;
            return this;
        }

        public TaskBuilder setProject(String project) {
            this.project = project;
            return this;
        }

        public TaskBuilder setDueDate(long dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public TaskBuilder setComments(List<Comment> comments) {
            this.comments = comments;
            return this;
        }

        public TaskBuilder setCreatedOn(long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        public TaskBuilder setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public TaskBuilder setUpdatedOn(long updatedOn) {
            this.updatedOn = updatedOn;
            return this;
        }

        public TaskBuilder setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
    }
}