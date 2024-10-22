package ADI_CW;

public class Lec_1 {
    public static void main(String[] args) {
        hashtableLinearProb h1 = new hashtableLinearProb(10);
        h1.InsertFun("hello1");
        h1.InsertFun("hello2");
        h1.InsertFun("hello3");
        h1.InsertFun("hello4");
        h1.InsertFun("hello5");
        h1.InsertFun("hello6");
        h1.InsertFun("hello7");
        h1.InsertFun("hello8");
        h1.InsertFun("hello9");
        h1.InsertFun("hello10");

        h1.display();
    }
}
class hashtableLinearProb{
    String[] hashTable;
    int capacity;
    hashtableLinearProb(int cap){
        hashTable = new String[cap];
        capacity=cap;
    }
    int hash(String key){
        return key.hashCode() % capacity;
    }
    void InsertFun(String key){
        int hashIndex=hash(key);
        while(hashTable[hashIndex]!=null){
            hashIndex=(hashIndex+1)%capacity;
        }
        hashTable[hashIndex]=key;
    }
    void display(){
        for(int i=0;i<=capacity;i++){
            if(hashTable[i]!=null){

            }
        }
    }
}
