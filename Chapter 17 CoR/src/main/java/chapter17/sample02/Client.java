package chapter17.sample02;

public class Client {
    public static void main(String args[]) {

        Leader director = new Director("王明", "主管");
        Leader manager = new Manager("赵强", "经理");
        Leader viceGeneralManager = new ViceGeneralManager("肖红", "副总经理");
        Leader generalManager = new GeneralManager("李波", "总经理");

        director.setSuccessor(manager);
        manager.setSuccessor(viceGeneralManager);
        viceGeneralManager.setSuccessor(generalManager);

        LeaveRequest lr1 = new LeaveRequest("张三", 2);
        director.handleRequest(lr1);

        LeaveRequest lr2 = new LeaveRequest("李四", 5);
        director.handleRequest(lr2);

        LeaveRequest lr3 = new LeaveRequest("王五", 15);
        director.handleRequest(lr3);

        LeaveRequest lr4 = new LeaveRequest("赵六", 25);
        director.handleRequest(lr4);

        LeaveRequest lr5 = new LeaveRequest("硅胶七", 35);
        director.handleRequest(lr5);
    }
}
