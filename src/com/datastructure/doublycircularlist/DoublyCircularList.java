// PROGRAM DOUBLY CIRCULAR LIST (DCL)
// Library Class

package com.datastructure.doublycircularlist;

public class DoublyCircularList {
    // DEKLARASI GLOBAL
    public class Node {
        int value;
        Node prev;
        Node next;
    }
    Node DCL;

    // METHODS
    public void insertFirst(int DAT) {
        // DEKLARASI LOKAL
        Node New = new Node();
        Node Last;

        // ALGORITMA
        New.value = DAT;
        if(this.DCL == null) {
            New.prev = New;
            New.next = New.prev;
        } else {
            Last = this.DCL.prev;
            New.prev = Last;
            New.next = this.DCL;
            this.DCL.prev = New;
            Last.next = this.DCL.prev;
        }
        this.DCL = New;
    }
    public void insertBefore(int Search, int DAT) {
        // DEKLARASI LOKAL
        Node New = new Node();
        Node NextNode;

        // ALGORITMA
        New.value = DAT;
        if(this.DCL == null) {
            return;
        } else {
            NextNode = this.DCL;
            while(NextNode.prev != this.DCL && NextNode.value != Search) {
                NextNode = NextNode.prev;
            }
            if(NextNode.value == Search) {
                New.prev = NextNode.prev;
                NextNode.prev = New;
                New.next = NextNode;
                New.prev.next = New;
            }
        }
    }
    public void insertAfter(int Search, int DAT) {
        // DEKLARASI LOKAL
        Node New = new Node();
        Node PrevNode;

        // ALGORITMA
        New.value = DAT;
        if(this.DCL == null) {
            return;
        } else {
            PrevNode = this.DCL;
            while(PrevNode.next != this.DCL && PrevNode.value != Search) {
                PrevNode = PrevNode.next;
            }
            if(PrevNode.value == Search) {
                New.next = PrevNode.next;
                PrevNode.next = New;
                New.prev = PrevNode;
                New.next.prev = New;
            }
        }
    }
    public void insertLast(int DAT) {
        // DEKLARASI LOKAL
        Node New = new Node();
        Node Last;

        // ALGORITMA
        New.value = DAT;
        if(this.DCL == null) {
            New.prev = New;
            New.next = New.prev;
            this.DCL = New;
        } else {
            Last = this.DCL.prev;
            New.prev = Last;
            New.next = this.DCL;
            this.DCL.prev = New;
            Last.next = this.DCL.prev;
        }
    }
    public void removeFirst() {
        // DEKLARASI LOKAL
        Node First;
        int DAT;

        // ALGORITMA
        if(this.DCL == null) {
            return;
        } else {
            if(this.DCL.next == this.DCL) {
                DAT = this.DCL.value;
                System.out.println("Data disingkirkan = " + DAT);
                this.DCL = null;
            } else {
                First = this.DCL;
                this.DCL = this.DCL.next;
                this.DCL.prev = First.prev;
                First.prev.next = this.DCL;
                DAT = First.value;
                System.out.println("Data disingkirkan = " + DAT);
                First = null;
            }
        }
    }
    public void removeSelected(int Search) {
        // DEKLARASI LOKAL
        Node Selected;
        Node PrevNode = null;
        int DAT;

        // ALGORITMA
        if(this.DCL == null) {
            return;
        } else {
            if(this.DCL.value == Search) {
                removeFirst();
            } else {
                Selected = this.DCL;
                while(Selected.next != this.DCL && Selected.value != Search) {
                    PrevNode = Selected;
                    Selected = Selected.next;
                }
                if(Selected.value == Search) {
                    PrevNode.next = Selected.next;
                    PrevNode.next.prev = PrevNode;
                    DAT = Selected.value;
                    System.out.println("Data disingkirkan = " + DAT);
                    Selected = null;
                } else {
                    return;
                }
            }
        }
    }
    public void removeLast() {
        // DEKLARASI LOKAL
        Node Last;
        int DAT;

        // ALGORITMA
        if(this.DCL == null) {
            return;
        } else {
            if(this.DCL.next == this.DCL) {
                DAT = this.DCL.value;
                System.out.println("Data disingkirkan = " + DAT);
                this.DCL = null;
            } else {
                Last = this.DCL.prev;
                this.DCL.prev = Last.prev;
                Last.prev.next = this.DCL;
                DAT = Last.value;
                System.out.println("Data disingkirkan = " + DAT);
                Last = null;
            }
        }
    }
    public void printList() {
        // DEKLARASI LOKAL
        Node Traversal;

        // ALGORITMA
        if(this.DCL == null) {
            return;
        } else {
            Traversal = this.DCL;
            do {
                System.out.print(Traversal.value + "->");
                Traversal = Traversal.next;
            } while(Traversal != this.DCL);
            System.out.println();
        }
    }
    public void reversePrintList() {
        // DEKLARASI LOKAL
        Node Traversal;

        // ALGORITMA
        if(this.DCL == null) {
            return;
        } else {
            Traversal = this.DCL.prev;
            do {
                System.out.print(Traversal.value + "->");
                Traversal = Traversal.prev;
            } while(Traversal != this.DCL.prev);
            System.out.println();
        }
    }
}
