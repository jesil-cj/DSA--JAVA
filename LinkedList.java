public class LinkedList{
    public class node{
        String val;
        node next;
        node(String val){
            this.val=val;
            this.next=null;
        }

    }


    //ADDING ELEMENTS AT FIRST
    node head;
    public void addfirst(String val){
        node newnode=new node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        System.out.println("Added at first: "+val);
    }


    //ADDING ELEMENTS AT LAST
    public void addlast(String val){
        node temp=head;
        node newnode=new node(val);
        if(head==null){
            head=newnode;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        System.out.println("Added at last: "+val);
    }
    public void Print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        LinkedList obj=new LinkedList();
        obj.addfirst(" <--first elements are in backward beacuse the elements were added before ");
        //usage of addfirst method in a for loop
        for (int i=1;i<=5;i++){
            obj.addfirst(String.valueOf(i)) ;
        }
        obj.addlast("last-->");
        //usage of addlast method in a for loop
        for (int i=6;i<=10;i++){
            obj.addlast(String.valueOf(i));
        }
        obj.Print();
    }
}
