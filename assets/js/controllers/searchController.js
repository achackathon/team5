(function(eaApp, angular, $) {
	'use strict';

	eaApp.controller('searchController', function($scope) {
		$scope.estabelecimentos = [
		{"id" : 1, "nome": "Subway", "rating": "5", "tipo": "Fast-food"},
		{"id" : 2, "nome": "Mc Donalds", "rating": "2", "tipo": "Bar"},
		{"id" : 3, "nome": "Burguer king", "rating": "3", "tipo": "Restaurante"}
	];
	});

})(angular.module('eaApp'), window.angular, window.jQuery);
