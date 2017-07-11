package chapter17.sample02;

public abstract class Leader {
    protected Leader successor;

    protected String name;
    protected String title;
    protected int allowLeaveDays;

    public Leader getSuccessor() {
        return successor;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public int getAllowLeaveDays() {
        return allowLeaveDays;
    }

    public void setAllowLeaveDays(int allowLeaveDays) {
        this.allowLeaveDays = allowLeaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Leader(String name, String title) {
        this.name = name;
        this.title = title;
    }

    protected Leader(String name, String title, int allowLeaveDays) {
        this.name = name;
        this.title = title;
        this.allowLeaveDays = allowLeaveDays;
    }

    public void handleRequest(LeaveRequest request) {
        System.out.printf("请假单提交给%s%s审批。\n", this.title, this.name);
        if (request.getLeaveDays() <= this.allowLeaveDays) {
            System.out.printf("%s%s审批员工%s的请假条，请假天数为%d天。\n\n", this.title, this.name, request.getLeaveName(), request.getLeaveDays());
        } else {
            if (this.successor != null) {
                System.out.printf("%s请假天数超过%d天，转给%s%s审批。\n", request.getLeaveName(), this.allowLeaveDays, this.successor.title, this.successor.name);
                this.successor.handleRequest(request);
            }
        }
    }
}
