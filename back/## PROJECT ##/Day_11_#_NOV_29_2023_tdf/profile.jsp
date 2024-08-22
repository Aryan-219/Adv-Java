<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${user == null}">
    <c:redirect url="signin.do" />
</c:if>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: User Profile ::</title>
    
    <link rel="icon" href="static/images/tdf_logo.ico">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

</head>
<body>
    <div class="container-fluid">
        <!-- ############################### -- Header -- ###################################-->
        <c:import url="header.jsp" />
        
        <!-- ############################### -- Page Body -- ###################################-->
        <div class="row">            
            <div class="col-10 offset-1">
                <h3 class="my-3 py-3 bg-light text-primary ps-3 rounded-2"><c:out value="${user.name}" /></h3>
                
                <div class="accordion accordion-flush" id="profile_parent_box">
                    <div class="accordion-item" style="border: 1px solid #ddd">
                        <h2 class="accordion-header">
                            <button type="button" class="accordion-button" data-bs-toggle="collapse" data-bs-target="#sub_section_1">
                                My Profile
                            </button>
                        </h2>
                        <div id="sub_section_1" class="accordion-collapse collapse show p-4" data-bs-parent="#profile_parent_box">
                            <div class="row">
                                <div class="col-md-4 justify-content-center d-flex">
                                    <div class="shadow-lg rounded-circle w-75 text-center">
                                        <img src="static/images/user.png" class="rounded-circle" width="270">
                                    </div>
                                </div>
                                <div class="col-md-8"></div>
                            </div>
                        </div>
                    </div>
                    <div class="accordion-item" style="border: 1px solid #ddd">
                        <h2 class="accordion-header">
                            <button type="button" class="accordion-button" data-bs-toggle="collapse" data-bs-target="#sub_section_2">
                                Interest
                            </button>
                        </h2>
                        <div id="sub_section_2" class="accordion-collapse collapse p-4" data-bs-parent="#profile_parent_box">
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis corrupti architecto vel, repellendus earum, debitis eius placeat incidunt quaerat consectetur totam repudiandae molestiae ab necessitatibus explicabo? Impedit ipsa sapiente quod?
                            Dolor dolore eligendi animi qui pariatur dignissimos est dicta ut, impedit delectus quae quis error hic consequatur vitae voluptas quos recusandae iusto odit neque facilis incidunt. Ab ullam a quae.
                            Eaque reprehenderit illum architecto vero corporis dolore, dicta commodi fugiat qui. Dolore eius magni ullam quidem architecto, vero consequatur sit unde dignissimos numquam ipsa sint nesciunt illo rerum incidunt quasi.
                        </div>
                    </div>
                    <div class="accordion-item" style="border: 1px solid #ddd">
                        <h2 class="accordion-header">
                            <button type="button" class="accordion-button" data-bs-toggle="collapse" data-bs-target="#sub_section_3">
                                Technologies Used
                            </button>
                        </h2>
                        <div id="sub_section_3" class="accordion-collapse collapse p-4" data-bs-parent="#profile_parent_box">
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis corrupti architecto vel, repellendus earum, debitis eius placeat incidunt quaerat consectetur totam repudiandae molestiae ab necessitatibus explicabo? Impedit ipsa sapiente quod?
                            Dolor dolore eligendi animi qui pariatur dignissimos est dicta ut, impedit delectus quae quis error hic consequatur vitae voluptas quos recusandae iusto odit neque facilis incidunt. Ab ullam a quae.
                            Eaque reprehenderit illum architecto vero corporis dolore, dicta commodi fugiat qui. Dolore eius magni ullam quidem architecto, vero consequatur sit unde dignissimos numquam ipsa sint nesciunt illo rerum incidunt quasi.
                        </div>
                    </div>
                    <div class="accordion-item" style="border: 1px solid #ddd">
                        <h2 class="accordion-header">
                            <button type="button" class="accordion-button" data-bs-toggle="collapse" data-bs-target="#sub_section_4">
                                Occupation
                            </button>
                        </h2>
                        <div id="sub_section_4" class="accordion-collapse collapse p-4" data-bs-parent="#profile_parent_box">
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Blanditiis corrupti architecto vel, repellendus earum, debitis eius placeat incidunt quaerat consectetur totam repudiandae molestiae ab necessitatibus explicabo? Impedit ipsa sapiente quod?
                            Dolor dolore eligendi animi qui pariatur dignissimos est dicta ut, impedit delectus quae quis error hic consequatur vitae voluptas quos recusandae iusto odit neque facilis incidunt. Ab ullam a quae.
                            Eaque reprehenderit illum architecto vero corporis dolore, dicta commodi fugiat qui. Dolore eius magni ullam quidem architecto, vero consequatur sit unde dignissimos numquam ipsa sint nesciunt illo rerum incidunt quasi.
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
        
        <!-- ############################### -- Footer -- ###################################-->
        <c:import url="footer.jsp" />
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>