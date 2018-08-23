package chapter17.sample02;

public class GeneralManager extends Leader {

    public GeneralManager(String name, String title) {
        super(name, title, 30);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        System.out.printf("请假单提交给%s%s审批。\n", this.title, this.name);
        if (request.getLeaveDays() <= this.allowLeaveDays) {
            System.out.printf("%s%s审批员工%s的请假条，请假天数为%d天。\n\n", this.title, this.name, request.getLeaveName(), request.getLeaveDays());
        } else {
            System.out.println("不同意！");
        }
    }
}
