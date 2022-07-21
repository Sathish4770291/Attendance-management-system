var checkboxes = document.querySelectorAll("input[type = 'checkbox']");

function checkAll(mycheckbox){
	if(mycheckbox.checked == true){
		checkboxes.forEach(function(checkbox){
			checkbox.checked =true;
		});
	}
	
	else{
		checkboxes.forEach(function(checkbox){
			checkbox.checked = false;
			
		});
	}
	
	
}