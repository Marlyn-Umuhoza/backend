package qt.practical_test.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToMany
    @Column(name = "assignee")
    private List<User> user;

    @ManyToOne
    @JoinColumn(name = "project")
    private Project project;

    @Column(name = "description")
    private String description;

    @Column(name = "priority")
    private Priority priority;

    @Column(name = "file_name")
    private String fileName;

    public Task() {

    }

    public Task(String title, Date startDate, Project project, String description) {
        this.title = title;
        this.startDate = startDate;
        this.project = project;
        this.description = description;
    }

    public Task(String title, Date startDate, Date endDate, List<User> assignee, Project project, String description,
            Priority priority) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        user = assignee;
        this.project = project;
        this.description = description;
        this.priority = priority;
    }

    public Task(String title, Date startDate, Date endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Task(String title, Date startDate, Date endDate, List<User> assignee, Project project, String description,
            Priority priority, String fileName) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        user = assignee;
        this.project = project;
        this.description = description;
        this.priority = priority;
        this.fileName = fileName;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<User> getAssignee() {
        return user;
    }

    public void setAssignee(List<User> assignee) {
        user = assignee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
