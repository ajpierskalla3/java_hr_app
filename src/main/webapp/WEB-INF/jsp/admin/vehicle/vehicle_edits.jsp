<%@include file="../../includes/header.jsp" %>
<%@include file="../../includes/navbar.jsp" %>
<%@include file="../../includes/subnav_admin.jsp" %>

<script>
    $(document).ready(function(){
        $('.remove_button').click(function() {
            console.log(this.name);
            console.log($('#' + this.name).val());
            $('#' + this.name).val('');
            $('#vehicleMake').submit();

        });
    })
</script>

<div class="wrapper">

    <%@ include file="vehicle_sidebar.jsp" %>
    <div id="main-wrapper" class="col-sm-10">
        <div class="col-sm-8">
            <c:set var="idx" value="0" scope="page" />
            <form:form class="form-horizontal" modelAttribute="vehicleMake" action="/admin/vehicle/update" method="post">
                <form:hidden path="id" />
                <form:hidden path="version" />

                <div class="row">
                    <div class="form-group"
                        <label for="inputVehicleMakeName" class="col-sm-2 control-label">Vehicle Make</label>
                        <div class="col-sm-10">
                            <form:input path="vehicleMakeName" type="text" id="inputVehicleMakeName" cssClass="form-control"></form:input>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-10">
                        <hr>
                    </div>
                </div>


                <c:forEach items="${vehicleMake.vehicleModelList}" var="veh">
                    <form:hidden path="vehicleModelList[${idx}].id" />
                    <form:hidden path="vehicleModelList[${idx}].version" />
                    <div class="row">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="inputElement">Vehicle Make</label>
                            <div class="col-sm-7">
                                <div class="input-group">
                                    <form:input path="vehicleModelList[${idx}].vehicleModelName" id="${idx}" class="form-control"/>
                                        <span class="input-group-btn">
                                            <button name="${idx}" class="btn btn-warning remove_button" type="button">Remove</button>
                                        </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <c:set var="idx" value="${idx + 1}" scope="page" />
                </c:forEach>

                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label" for="inputNewVehicleModel">Add New Model</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="inputNewVehicleModel" id="inputNewVehicleModel"/>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <button class="btn btn-primary">Update</button>
                </div>
            </form:form>
        </div>
    </div>
</div>


<%@include file="../../includes/footer.jsp"  %>