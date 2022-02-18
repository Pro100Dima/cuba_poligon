import { StandardEntity } from "./base/sys$StandardEntity";
export class Customer extends StandardEntity {
  static NAME = "cubapoligon_Customer";
  name?: string | null;
  email?: string | null;
}
export type CustomerViewName = "_base" | "_local" | "_minimal";
export type CustomerView<V extends CustomerViewName> = V extends "_base"
  ? Pick<Customer, "id" | "name" | "email">
  : V extends "_local"
  ? Pick<Customer, "id" | "name" | "email">
  : V extends "_minimal"
  ? Pick<Customer, "id" | "name">
  : never;
