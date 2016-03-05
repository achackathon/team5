(function(eaApp, angular, $) {
	'use strict';

	eaApp.controller('searchController', function($scope, searchService, categories) {
		$scope.estabelecimentos = [
			{"id" : 1, "nome": "Subway", "rating": "5", "tipo": "Fast-food"},
			{"id" : 2, "nome": "Mc Donalds", "rating": "2", "tipo": "Bar"},
			{"id" : 3, "nome": "Burguer king", "rating": "3", "tipo": "Restaurante"}
		];

		$scope.status = [
			"Neutro", "Ruim", "Ruim", "Regular", "Bom", "Bom"
		];

		var timeoutSearch;
		$scope.handleSearch = function() {
			clearTimeout(timeoutSearch);

			timeoutSearch = setTimeout(function() {
				$scope.doSearch();
			}, 600);
		};

		$scope.doSearch = function() {
			searchService.search($scope.searchText).success(function(data) {
				$scope.results = data;

				var i, j;
				var accessSum;
				var place;
				var length = $scope.results.length;

				for(i=0; i<length; i++) {
					place = $scope.results[i];

					accessSum = 0;
					for(j=0; j<place.accessibilityItem.length; j++) {
						accessSum += place.accessibilityItem[j].grade;
					}

					place.grade = Math.round(accessSum/place.accessibilityItem.length) + 1;
				}
			});
		};

		$scope.cardColors = ['#2980b9', '#3498db', '#34495e', '#27ae60', '#7f8c8d'];
		$scope.cards = categories.data;
	});

})(angular.module('eaApp'), window.angular, window.jQuery);
