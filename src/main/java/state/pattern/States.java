package state.pattern;

// Implement the three concrete state classes

// DraftState: Initial state where editing is allowed
class DraftState implements DocumentState {
    // TODO: Implement edit method
    // - Print "Editing draft..."
    @Override
    public void edit(Document doc) {
        System.out.println("Editing draft...");
    }
    // TODO: Implement approve method
    // - Print "Draft approved. Moving to review."
    // - Transition document to ReviewState
    @Override
    public void approve(Document doc) {
        System.out.println("Draft approved. Moving to review.");
        doc.setState(new ReviewState());
    }
}

// ReviewState: Document is under review, no editing allowed
class ReviewState implements DocumentState {
    // TODO: Implement edit method
    // - Print "Cannot edit during review."
    @Override
    public void edit(Document doc) {
        System.out.println("Cannot edit during review.");
    }

    // TODO: Implement approve method
    // - Print "Review complete. Publishing document."
    // - Transition document to PublishedState
    @Override
    public void approve(Document doc) {
        System.out.println("Review complete. Publishing document.");
        doc.setState(new PublishedState());
    }
}

// PublishedState: Final state, no changes allowed
class PublishedState implements DocumentState {
    // TODO: Implement edit method
    // - Print "Cannot edit published document."
    @Override
    public void edit(Document doc) {
        System.out.println("Cannot edit published document.");
    }
    // TODO: Implement approve method
    // - Print "Document already published."
    @Override
    public void approve(Document doc) {
        System.out.println("Document already published.");
    }
}
