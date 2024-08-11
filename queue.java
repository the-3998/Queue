import java.util.Scanner;

class define_queue{
    int rear,front,element;
    int Size = 5 ;
    int []Queue = new int[Size];
    define_queue(){
        this.rear = -1;
        this.front = -1;
    }

    boolean isempty(){
        return this.front == -1;
    }
    boolean isFull(){
        return this.rear == Size-1;
    }

    void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else{
            if(isempty()){
                this.front = 0;
            }
            Queue[++rear] = element;
            
            System.out.println("Element Insert "+element);
        }
    }
    void dequeue(){
        if(isempty()){
            System.out.println("Queue is Empty");
        }
        else{
            
            element = Queue[front] ;
            if (this.front == this.rear) {

                this.front = this.rear = -1;
            }else{
                front += 1;
            }
            System.out.println("Element Deleted "+element);
        }
    }
    void display() {
        if (isempty()) {

            System.out.println("Queu is Underflow");

        } else {
            for (int i = 0; i <= rear; i++) {
                System.out.println("Element " + (i + 1) + ":" + Queue[i]);

            }
        }

    }
}



public class queue {
    public static void main(String[] args) {
        define_queue s = new define_queue();
        int choice, element;
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("\n");
                System.out.println("1. For Enqueue\n2. For Dequeue\n3. Display\nEnter your Choice:");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("");
                        System.out.println("Enter your Element: ");
                        element = input.nextInt();
                        s.enqueue(element);
                    }
                    case 2 -> {
                        s.dequeue();
                    }
                    case 3 -> s.display();

                    default -> {
                        System.out.println("");
                        System.out.println("This Wrong Case");
                    }

                }
            }
        }
        
    }
}
