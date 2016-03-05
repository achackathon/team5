(function(eaApp, angular, $) {
	'use strict';

	eaApp.controller('searchController', function($scope, categories) {
		$scope.estabelecimentos = [
			{"id" : 1, "nome": "Subway", "rating": "5", "tipo": "Fast-food"},
			{"id" : 2, "nome": "Mc Donalds", "rating": "2", "tipo": "Bar"},
			{"id" : 3, "nome": "Burguer king", "rating": "3", "tipo": "Restaurante"}
		];

		$scope.status = [
			"Ruim", "Ruim", "Ruim", "Regular", "Bom", "Bom"
		];

		var timeoutSearch;
		$scope.handleSearch = function() {
			clearTimeout(timeoutSearch);

			timeoutSearch = setTimeout(function() {
				$scope.doSearch();
			}, 300);
		};

		$scope.doSearch = function() {
			searchService.search($scope.searchText).success(function(data) {
				$scope.results = data;
			});
		};

		$scope.cardColors = ['#2980b9', '#3498db', '#34495e', '#27ae60', '#7f8c8d'];
		$scope.cards = categories.data;
	});

})(angular.module('eaApp'), window.angular, window.jQuery);
