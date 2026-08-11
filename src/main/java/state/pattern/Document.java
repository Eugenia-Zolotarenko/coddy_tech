package state.pattern;

// Document class - the Context in the State Pattern
// This class maintains the current state and delegates actions to it

class Document {
    // TODO: Declare a private field to hold the current DocumentState
    private DocumentState documentState;

    // TODO: Constructor - initialize the state to DraftState
    public Document() {
        this.documentState = new DraftState();
    }
    // TODO: Implement setState method to change the current state
    public void setState(DocumentState documentState) {
        this.documentState = documentState;
    }

    // TODO: Implement edit method that delegates to current state's edit
    public void edit(){
       documentState.edit(this);
    }

    // TODO: Implement approve method that delegates to current state's approve
    public void approve (){
        documentState.approve(this);
    }

    // TODO: Implement getStatus method that returns the simple class name of current state
    // Hint: use getClass().getSimpleName()
    public String getStatus(){
        return documentState.getClass().getSimpleName();
    }
}
