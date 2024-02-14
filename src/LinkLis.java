import java.util.*;

public class LinkLis {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    //add element in linklist
    public void firstele(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

//        return;
    }
    //add element in last
    public void lastele(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;

        }
        currentNode.next=newNode;
    }
    public void deletefirstele(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
    }
    public void printlink(){
        if(head==null){
            System.out.println("list is empty");
            return;
        } Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"---");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }
//    if(head==null){
//        System.out.println("list is empty");
//        return;
//    }
//    Node cnode=head;
//while(cnode!=null){
//        System.out.println(cnode.nodeData+"->");
//        cnode=cnode.next;
//    }
//System.out.println("NULL");
//    public void deletefirstele(){
//        if(head==null){
//            System.out.println("list is empty");
//        }
//        head=head.next;
//    }
//    if(head.next==0){
//        head=null;
//        return;
//    }
    public void deletelastele(){
        Node sl=head;
        Node ln=head.next;
        while (ln.next!=null){
            ln=ln.next;
            sl=sl.next;
        }
        sl.next=null;
    }

    public static void main(String[] args) {
        LinkLis ll1=new LinkLis();
        ll1.firstele(6);
        ll1.firstele(8);
        ll1.firstele(23);
//        ll1.lastele(21);
        ll1.deletefirstele();
//        ll1.deletefirstele();
        ll1.deletelastele();
//        ll1.deletelastele();
       ll1.printlink();
//       LinkedList<Integer> list1=new LinkedList<>();
//       list1.add(7);
//        list1.add(6);
//        list1.add(9);
//        list1.addFirst(10);
//        list1.remove(0);
//        list1.add(0,11);
//        list1.add(2,55);
//        System.out.println(list1);
//        System.out.println(list1.size());
//        new Node(4);
    }
}
