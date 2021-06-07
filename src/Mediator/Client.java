package Mediator;

public class Client {
    public static void main(String[] args) {
        AbstractChatroom chatroom1=new ChatGroup();
        Member member1,member2,member3,member4,member5;
        member1=new DiamondMember("alice");
        member2=new DiamondMember("bob");
        member3=new CommonMember("cindy");
        member4=new CommonMember("david");
        member5=new CommonMember("eric");

        chatroom1.register(member1);
        chatroom1.register(member2);
        chatroom1.register(member3);
        chatroom1.register(member4);
        chatroom1.register(member5);

        member1.sendText("bob","hello");
        member2.sendText("alice","hello");
        member1.sendText("bob","whats the weather today");
        member2.sendImage("alice","Big Sun");
        member2.sendImage("alice","Sun");
        member3.sendText("david","whats your problem");
        member3.sendText("eric","whats your problem");
        member4.sendText("cindy","no problem");
        member5.sendText("cindy","no problem too");
        member5.sendImage("cindy","thanks");

    }
}
