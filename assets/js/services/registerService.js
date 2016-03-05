(function(eaApp, angular, $) {
	'use strict';

	eaApp.service('registerService', function($http) {
		return {
			addNewItem: function(newItem) {
				return $http.post('accessibility', newItem);
			},
			addCategory: function(newCategory) {
				return $http.post('category', newCategory);
			},
			listAccessibility: function() {
				return $http.get('accessibility');
			},
			listCategories: function() {
				return $http.get('category');
			},
			addEstablishment: function(newEstablishment) {
				return $http.post('places', newEstablishment);
			}
		}
	});

})(angular.module('eaApp'), window.angular, window.jQuery);