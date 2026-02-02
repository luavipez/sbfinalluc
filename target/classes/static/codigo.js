function actualizar(){
    var tabla = document.getElementById("tblP");
    for(var i =1; i< tabla.rows.length; i++){
    tabla.rows[i].onclick = function(){
        document.getElementById("idact").value = this.cells[0].innerHTML;
        document.getElementById("nombreact").value = this.cells[1].innerHTML;
        document.getElementById("precioact").value = this.cells[2].innerHTML;
        }
    }
}

function eliminar(){
var tbl = document.getElementById("tblP");
for(var i=1; i<tbl.rows.length; i++){
    tbl.rows[i].onclick = function(){
    document.getElementById("ideli").value = this.cells[0].innerHTML;
    document.getElementById("nombreeli").value = this.cells[1].innerHTML;
    document.getElementById("precioeli").value = this.cells[2].innerHTML;
    }
}
}