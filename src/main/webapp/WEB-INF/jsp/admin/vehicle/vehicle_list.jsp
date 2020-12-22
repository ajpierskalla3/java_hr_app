<%@include file="../../includes/header.jsp" %>
<%@include file="../../includes/navbar.jsp" %>
<%@include file="../../includes/subnav_admin.jsp" %>

<div class="wrapper">

    <%@include file="vehicle_sidebar.jsp" %>
    <div id="main-wrapper" class="col-sm-10">
        <div class="col-sm-12">
            <table class=" table table-striped table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Vehicle Make</th>
                        <th>Models</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="vehicleMake" items="${vehicleMakeList}">
                        <tr></tr>
                            <td>${vehicleMake.id}</td>
                            <td>${vehicleMake.vehicleMakeName}</td>
                            <td>Models here...</td>
                            <td><a href="/admin/vehicle/edit/${vehicleMake.id}">Edit</a></td>
                            <td><a href="/admin/vehicle/delete/${vehicleMake.id}">Delete</a></td>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>


<%@include file="../../includes/footer.jsp"  %>