package Pattern;

// TODO: Create three classes that implement the Pattern interface

// CreationalPattern class
// - getCategory() should return "Creational"
// - getPurpose() should return "How objects are created"
class CreationalPattern implements Pattern {
    // TODO: Implement getCategory()
    @Override
    public String getCategory() {
        return "Creational";
    }
    // TODO: Implement getPurpose()
    @Override
    public String getPurpose() {
        return "How objects are created";
    }
}

// StructuralPattern class
// - getCategory() should return "Structural"
// - getPurpose() should return "How objects are composed"
class StructuralPattern implements Pattern {
    // TODO: Implement getCategory()
    @Override
    public String getCategory() {
        return "Structural";
    }
    // TODO: Implement getPurpose()
    @Override
    public String getPurpose() {
        return "How objects are composed";
    }
}

// BehavioralPattern class
// - getCategory() should return "Behavioral"
// - getPurpose() should return "How objects communicate"
class BehavioralPattern implements Pattern {
    // TODO: Implement getCategory()
    @Override
    public String getCategory() {
        return "Behavioral";
    }
    // TODO: Implement getPurpose()
    @Override
    public String getPurpose() {
        return "How objects communicate";
    }
}