package chapter17.sample02;

public class LeaveRequest {
    private String leaveName;
    private int leaveDays;

    public LeaveRequest(String leaveName, int leaveDays) {
        this.leaveName = leaveName;
        this.leaveDays = leaveDays;
        System.out.printf("%s请假%d天。\n", this.leaveName, this.leaveDays);
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getLeaveName() {
        return (this.leaveName);
    }

    public int getLeaveDays() {
        return (this.leaveDays);
    }
}
