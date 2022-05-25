class bsics {
    public static void main(String[]args){
//public person(){
   // System.out.println("creating new object");
//}

 //creating object person
 person p1 = new person();
  p1.name="bkbibhesh";
  p1.age=78;

  person p2=new person();
  p2.name="bkbibhesh2";
  p2.age=45;

System.out.println(p1.age+" "+ p1.name);
System.out.println(p2.age+" "+p2.name);

System.out.println(person.count);

p1.eat();
p2.wlak();
p2.wlak(22);

    }
}
    class person{
        String name;
        int age;
        
        static int count;

        public person(){
            count++;
            System.out.println("hi ");
        }
        void wlak(){
            System.out.println(name + "is walkinging");
        }

        void eat(){
            System.out.println(name+"is eating");
        }

        void wlak(int steps){
            System.out.println("name"+"waLked"+steps+"Steps");
        }

//constructor used for cunstruct new objects as oerson o2
 
}
