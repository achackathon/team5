(function(eaApp, angular, $) {
	'use strict';

	eaApp.controller('registerController', function($scope) {
		$scope.showAddNewItem = false;

		$scope.accessibilityItens = [
			{
				name: 'rampa'
			},
			{
				name: 'menu em braile'
			},
			{
				name: 'garçom que conhece libras'
			},
			{
				name: 'garçom que conhece libras'
			},
			{
				name: 'garçom que conhece libras'
			},
			{
				name: 'garçom que conhece libras'
			}
		];

		$scope.cancelAddNewItem = function() {
			$scope.showAddNewItem = false;
		};
		$scope.displayAddNewItem = function() {
			$scope.showAddNewItem = true;
		};

		$scope.cancelAddCategory = function() {
			$scope.showAddCategory = false;
		};
		$scope.displayAddCategory = function() {
			$scope.showAddCategory = true;
		};
	});

})(angular.module('eaApp'), window.angular, window.jQuery);