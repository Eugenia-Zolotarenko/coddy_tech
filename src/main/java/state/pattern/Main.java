package state.pattern;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String input = "edit";
        input = "approve";
        input = "edit,approve,approve";
        input = "approve,approve";
        input = "edit,edit,edit";
        input = "approve,edit,approve";
        input = "edit,approve,edit,approve";
        input = "approve,approve,approve";
        input = "edit,approve,edit,approve,edit";
        input = "edit,edit,approve,edit,approve,approve,edit";


        // TODO: Create a new Document
        Document document = new Document();

        // TODO: Print the initial status in format "Status: [state]"
        System.out.println("Status: " + document.getStatus());

        // TODO: Split the input by comma to get individual actions
        String[] actions = input.split(",");

        // TODO: Loop through each action
        // - If action is "edit", call edit() on document
        // - If action is "approve", call approve() on document
        // - After each action, print the current status
        for (String action: actions){
            switch (action){
                case "edit" -> {
                    document.edit();
                    System.out.println("Status: " + document.getStatus());
                }
                case "approve" -> {
                    document.approve();
                    System.out.println("Status: " + document.getStatus());
                }
                default -> System.out.println("invalid action");
            }
        }
    }
}
