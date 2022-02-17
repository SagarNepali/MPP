package prob1.bugreporter;

public class Bug {
    int severity;
    String description;
    String reportedBy;
    String className;

    public Bug(int severity, String description, String reportedBy,String className) {
        this.severity = severity;
        this.description = description;
        this.reportedBy = reportedBy;
        this.className = className;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
