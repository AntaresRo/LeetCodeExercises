package org.example;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String title) {
        super.title = title;
    }

    @Override
    String getTitle() {
        System.out.println("The title is: " + super.getTitle());
        return super.getTitle();
    }
}
