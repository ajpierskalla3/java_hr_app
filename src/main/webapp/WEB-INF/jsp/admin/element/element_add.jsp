<%@ include file="../../includes/header.jsp" %>
<%@ include file="../../includes/navbar.jsp" %>
<%@ include file="../../includes/subnav_admin.jsp" %>

<script>
    $(document.ready(function(){
        $("#successAlert").delay(8000).fadeOut(2000);
        $("#warningAlert").delay(10000).fadeOut(2000);

    });
</script>
<div class="wrapper">
        <%@ include file="element_sidebar.jsp" %>
        <div id="main-wrapper" class="col-sm-10">
            <div class="col-sm-8">
                <form:form cssClass="form-horizontal" modelAttribute="elementVO" action="/admin/element/add/" method="post">
                    <fieldset>
                        <legend>Element Management</legend>

                        <div class="form-group">

                            <div class="col-lg-10">
                            <label for="inputNewElementType" class="col-lg-3 control-label" >Element Type</label>
                                <form:input path="newElementType" type="text" class="form-control" id="inputNewElementType" placeholder="Element Type"></form:input>
                            </div>
                        </div>

                        <div class="form-group">
                                <div class="col-lg-10">

                                <label for="inputNewElements" class="col-lg-2 control-label" >Elements</label>
                                    <form:textarea path="newElements" rows="3" class="form-control" id="inputNewElements" placeholder="Elements"></form:textarea>
                                    <span class="help-block">Enter each new Element on a new line.</span>
                                </div>
                        </div>

                        <div>
                            <div class="col-lg-10 col-lg-offset-2">
                                <form:button type="reset" value="cancel" class=" btn btn-default">Cancel</form:button>
                                <form:button type="submit" value="save" class=" btn btn-primary">Submit</form:button>
                            </div>
                        </div>
                    </fieldset>
                </form:form>
            </div>

            <div class="col-sm-4">

                <div class="${successAlert == null ? 'hidden' : successAlert}" id="successAlert">
                    <div class="alert alert-dismissible alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong>Element added successfully to database!</strong> You successfully read <a href="#" class="alert-link">This important alert message</a>
                    </div>
                </div>

                <div class="${warningAlert == null ? 'hidden' : warningAlert}" id="warningAlert">
                    <div class="alert alert-dismissible alert-warning">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <h4>WARNING!</h4>
                        <p>Please reconsider your brilliant idea</p>
                    </div>
                </div>

                <div class="${errorAlert == null ? 'hidden' : errorAlert}" id="errorAlert">
                    <div class="alert alert-dismissible alert-danger">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong>Oh No!</strong> <a href="#" class="alert-link">Important alert message</a>
                    </div>
                </div>

               </div>

            </div>
        </div>
</div>



<%@ include file="../../includes/footer.jsp" %>