<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<section id="animesSection">   
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Lista de animes</h4>
                        
                    </div>
                    
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Nmobre</th>
                                <th>Autor</th>
                                <th>Capitulos</th>
                                <th>Finalizado</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                           <c:forEach var="anime" items="${animes}">
                               <tr>
                                   <td> ${anime.idAnime} </td>
                                   <td> ${anime.nombre} </td>
                                   <td> ${anime.autor} </td>
                                   <td> ${anime.capitulos} </td>
                                   <td> ${anime.finalizado} </td>
                                   <td>
                                       <a href="1" class="btn-secundary">
                                           <i class="fas fa-angle-double-rigth"></i>
                                           Editar
                                       </a>
                                   </td>
                               </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
