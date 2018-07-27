package backpack;

import java.util.ArrayList;

class Backpack {
    private int capacity;
    ArrayList<Thing> set;

    Backpack (int capacity) {
        this.capacity = capacity;
        set = new ArrayList();
    }

    Backpack () {
        this.capacity = 20;
    }

    int getCapacity() {
        return this.capacity;
    }

    void addThing(Thing current){
        set.add(current);
    }

    void removeThing(Thing current) {
        set.remove(current);
    }

    void pickupThing (Thing[] arr, int i, int j, int cw, int cc, ArrayList<Thing> cArr, ArrayList<Thing> mArr) {
        int maxC = 0;
        int maxW = 0;
        for (int a = 0; a < arr.length; a++) {
            cw = arr[a].getWeight();
            cc = arr[a].getCost();
            cArr.clear();
            cArr.add(arr[a]);
           for (int b = a+1; b < arr.length; b++) {
                if (cw + arr[b].getWeight() <= capacity) {
                    cw = cw + arr[b].getWeight();
                    cc = cc + arr[b].getCost();
                    cArr.add(arr[b]);
                }else {
                    if (cc > maxC) {
                        maxC = cc ;
                        maxW = cw;
                        mArr.clear();
                        for (Thing t:cArr) {
                            mArr.add(t);
                        }

                    }
                    cw = arr[a].getWeight() + arr[b].getWeight();
                    cc = arr[a].getCost() + arr[b].getCost();
                }
                //System.out.println("cw" + cw);
                //System.out.println("cc" + cc);
            }
            if (cc > maxC) {
               maxC = cc ;
               maxW = cw;
               mArr.clear();
                for (Thing t:cArr) {
                    mArr.add(t);
                }
            }

        }
        if (cc > maxC) {
            maxC = cc ;
            maxW = cw;
            mArr.clear();
            for (Thing t:cArr) {
                mArr.add(t);
            }
        }
        System.out.println("max cost" + maxC);
        System.out.println("max weight" + maxW);

        for (Thing t:mArr) {
            System.out.println(t);
        }

        //тут работает
        /*if (i == 4) {
            j++;
            if (arr[j].getWeight() + cw <= capacity) {
                System.out.println(arr[i]);

            } else if (j < 5) {
                System.out.println("**********");
                pickupThing(arr, j, j, 0);
            }


        } else {
            if (arr[j].getWeight() + cw <= capacity) {
                System.out.println(arr[i]);
            }else if (arr[i].getCost() > arr[i-1].getCost() &
                        cw - arr[i-1].getWeight() + arr[i].getWeight() <= capacity) {
                System.out.println(" - " + arr[i - 1]);
                System.out.println(" + " + arr[i]);
                cw = cw - arr[i-1].getWeight() + arr[i].getWeight();
            }
            pickupThing(arr, ++i, j, cw + arr[i].getWeight());
        }*/
    }

    @Override
    public String toString() {
        String str = "Backpack [";
        for (int i = 0; i<set.size(); i++){
            str = str + set.get(i) + ",";
        }
        str = str + "]";
        return (str);
    }
}
