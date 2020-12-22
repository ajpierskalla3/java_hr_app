package com.astontech.hr.domain.VO;

public class VehicleVO {
//    private String newVehicle;
    private String newVehicleMake;
    private String newVehicleModel;
    private String[] newVehicleModelArray;
//    private String[] newVehicleArray;

    public VehicleVO(){}

    public void splitNewElementsIntoArray(){
        this.setNewVehicleModelArray(this.newVehicleModel.split("\\r?\\n"));
    }

    public String getNewVehicleMake() {
        return newVehicleMake;
    }

    public void setNewVehicleMake(String newVehicleMake) {
        this.newVehicleMake = newVehicleMake;
    }

    public String getNewVehicleModel() {
        return newVehicleModel;
    }

    public void setNewVehicleModel(String newVehicleModel) {
        this.newVehicleModel = newVehicleModel;
    }

    public String[] getNewVehicleModelArray() {
        return newVehicleModelArray;
    }

    public void setNewVehicleModelArray(String[] newVehicleModelArray) {
        this.newVehicleModelArray = newVehicleModelArray;
    }
}










//<div class="form-group">
//<div class="col-lg-10">
//<label for="inputNewVehicle" class="col-lg-2 control-label" >Vehicle</label>
//<form:textarea path="newVehicle" rows="3" class="form-control" id="inputNewVehicle" placeholder="Vehicle"></form:textarea>
//<span class="help-block">Enter each new Element on a new line.</span>
//</div>
//</div>