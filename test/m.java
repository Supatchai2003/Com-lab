package test;
public class m {
    protected int calories;
    protected int watt;
    
    public static class Microwave  {
        private boolean isOpen;
        private packedlunch currentLunch;
        private int level;
        private int time;
        packedlunch n ;
        protected int food = 0;

        public Microwave() {
            isOpen = false;
            currentLunch = null;
            level = 0;
            time = 0;
        }

        public void open() {
            System.out.println("Microwave is now open.");
            isOpen = true;
        }

        public void close() {
            System.out.println("Microwave is now closed.");
            isOpen = false;
        }

        public void put(packedlunch lunch) {
            if (isOpen) {
                currentLunch = lunch;
                System.out.println("Packed lunch " + lunch.getName() + " is placed in the microwave.");
            } else {
                System.out.println("Error: Microwave is not open. Please open it first.");
            }
        }

        public void setLevel(int level) {
            
            this.level = level;
            switch (level) {
                case 1:
                    System.out.println("strttf");
                    
                    if(1==1){
                    for(int i=0;i<4;i++)
                      {  food += 25;
                        System.out.println("drdrs"+food);}}
                    
                    
                    break;
                    case 2:
                    System.out.println("strttf");
                    
                    if(2==2){
                    for(int i=0;i<4;i++)
                      {  food += 25;
                        System.out.println("well"+food);}}
                    
                    
                    break;    
                    case 3:
                    System.out.println("strttf");
                    
                    if(3==3){
                    for(int i=0;i<4;i++)
                      {  food += 25;
                        System.out.println("drdrs"+food);}}
                    
                    
                    break;
                    case 4:
                    System.out.println("strttf");
                    
                    if(4==4){
                    for(int i=0;i<4;i++)
                      {  food += 25;
                        System.out.println("drdrs"+food);}}
                    
                    
                    break;        
                default:
                    break;
            }
            System.out.println("Microwave level set to " + level);
        }
    
        public void setTime(int time) {
            this.time = time;
            System.out.println("Microwave time set to " + time + " minutes.");
        }
    }

    public static class packedlunch extends m {
        private String name;
        private int quantity;

        public packedlunch(String name, int watt, int time) {
            this.name = name;
            this.calories = watt;
            this.quantity = time;
            getCalories(watt);
        }

        public String getName() {
            return name;
        }
        public int getQuantity() {
            return quantity;
        }
    }
    
    public int getCalories(int c) {
        return calories;
    }
}
 